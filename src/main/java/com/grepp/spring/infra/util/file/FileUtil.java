package com.grepp.spring.infra.util.file;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUtil {

    // properties 주입받으려면 bean이되어야되서 컴포넌트처리
    @Value("${upload.path}")
    private String filePath ;

    public List<FileDto> upload(List<MultipartFile> files, String depth) throws IOException {
        List<FileDto> fileDtos = new ArrayList<>();

        // 빠른 return 처리
        if (files.isEmpty() || files.getFirst().isEmpty()) return fileDtos;
        String savePath = createSavePath(depth);

        for(MultipartFile file : files) {
            String originFileName = file.getOriginalFilename();
            String renameFileName = generateRenameFileName(originFileName);
            FileDto fileDto = new FileDto(originFileName, renameFileName, savePath);
            fileDtos.add(fileDto);
            uploadFile(file, fileDto);
        }

        return fileDtos;
    }

    private void uploadFile(MultipartFile file, FileDto fileDto) throws IOException {
        File path = new File(fileDto.savePath());
        if(!path.exists()){
            path.mkdirs();
        }

        File target = new File(fileDto.savePath() + fileDto.renameFileName());
        file.transferTo(target);
    }

    private String generateRenameFileName(String originFileName) {
        //확장자 짜르기
        String ext = originFileName.substring(originFileName.lastIndexOf("."));
        return UUID.randomUUID().toString() + ext;

    }

    private String createSavePath(String depth) {
        LocalDate now = LocalDate.now();
        return filePath + depth + "/" +
            now.getYear() + "/" +
            now.getMonth() + "/" +
            now.getDayOfMonth() + "/";
    }
}
