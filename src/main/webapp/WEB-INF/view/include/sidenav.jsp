<%--
  Created by IntelliJ IDEA.
  User: cho
  Date: 2025. 4. 8.
  Time: 오전 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" %>
<nav>
    <ul id="slide-out" class="sidenav">
        <li><div class="user-view">
            <div class="background">
                <img src="${context}assets/img/flower1.png">
            </div>
            <a href="#user"><img class="circle" src="${context}assets/img/flower1.png"></a>
            <a href="#name"><span class="white-text name">John Doe</span></a>
            <a href="#email"><span class="white-text email">jdandturk@gmail.com</span></a>
        </div></li>
        <li><a href="#!"><i class="material-icons">cloud</i>First Link With Icon</a></li>
        <li><a href="#!">Second Link</a></li>
        <li><div class="divider"></div></li>
        <li><a class="subheader">Subheader</a></li>
        <li><a class="waves-effect" href="#!">Third Link With Waves</a></li>
    </ul>

</nav>
<script>
  document.addEventListener('DOMContentLoaded', function() {
    const elems = document.querySelectorAll('.sidenav');
    const instances = M.Sidenav.init(elems);
  });
</script>


