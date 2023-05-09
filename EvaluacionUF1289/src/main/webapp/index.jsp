<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>

<html lang="es">


<head>

<meta charset="UTF-8">
<title>Libreria digital</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>


<link rel="icon" href="<c:url value="img/desarrollador-de-software.png"></c:url>">
<style>
 body{ background-image: url("img/libros.jpg");
}
</style>



</head>

<body>

<div class="container text-center "  >
	<h1 class="mb-4 text-danger">Datos del Libro</h1>
<form action="Controller" method="post" class="form-control border border-3 bg-danger-subtle border-dark-subtle needs-validation" novalidate>
<div >
<label for="titulo" class="form-group fw-bolder  py-3 text-decoration-underline">TITULO DEL LIBRO</label>
<input type="text" name="titulo" value="${param.titulo}" class="form-control bg-secondary text-light" required pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+" Maxlength="50">
<label for="autor" class="form-group fw-bolder  py-3 text-decoration-underline">NOMBRE DEL AUTOR</label>
<input  type="text" name="autor" value="${param.autor}" class="form-control bg-secondary text-light" required pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+" Maxlength="20">

<label for="cantidad" class="form.group fw-bolder  py-3 text-decoration-underline">GÉNERO LITERARIO</label>
 <select class="form-select form-select-sm bg-secondary text-light" id="floatingSelect"  aria-label="Floating label select example" name="genero" required>
    <option  value="" disabled selected>Elige una opcion*</option>
    <option value="accion">Acción</option>
    <option value="ficcion">Ciencia Ficcion</option>
    <option value="romance">Romance</option>
    <option value="fantasia">Fantasia</option>
    <option value="drama">Drama</option>
  </select>  
  <label for="cantidad"  class="form-group fw-bolder  py-3 text-decoration-underline">CANTIDAD</label>
<input type="text" name="cantidad" value="${param.cantidad}" class="form-control bg-secondary text-light"  required pattern="^[0-9]+" >
 <input type="submit" name="enviar" value="Aceptar" class="btn btn-info mt-4">
</div>
  </form>
  <div class="text-center my-4   fw-bolder text-decoration-underline" >
<c:if test="${not empty mensaje}" ><c:out value="${mensaje}" ></c:out></c:if>
<c:if test="${not empty listado}">
<table class="table table-dark table-striped  mt-2" >
<tr>
<th>ID</th>
<th>Titulo</th>
<th>Autor</th>
<th>Genero</th>
<th>ISBN</th>
<th>Cantidad</th>
<th>Acciones</th>

</tr>
<c:forEach items="${listado}" var="listado">
<tr>
<td><c:out value="${listado.idTemp}"></c:out></td>
<td><c:out value="${listado.titulo}"></c:out></td>
<td><c:out value="${listado.autor}"></c:out></td>
<td><c:out value="${listado.cantidad}"></c:out></td>
<td><c:out value="${listado.isbn}"></c:out>-<c:out value="${listado.inicio}"></c:out><a href="#">&#127991;</a></td>
<td><c:out value="${listado.genero}"></c:out></td>
<td><a href="Controller?idTemp=${listado.idTemp}&opcion=borrar" id="borrar" title="Borrar">&#128465;</a>
</td>

</tr>
</c:forEach>
</table>
</c:if>


</div>


</div>
<script src="<c:url value="js/script.js"/>"></script>

</body>
</html>