<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="es">
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Inscripción Mi Kinder</title>
</head>
<body class="mx-5">
<jsp:include page="header.jsp"></jsp:include>
<!-- Incluir el encabezado en todas las páginas -->
<h2 class="bg-success-subtle text-center">Datos del niñ@</h2>
<div id="contenedor">
<div class="row">
  <div class="col">
	Nombre:
    <c:out value="${param.nombren}"></c:out>
  </div>
  <div class="col">
  Apellidos:
    <c:out value="${param.apellidosn}"></c:out>
  </div>
  <div class="col-2 text-end pt-xl-2" >

  </div>
  <div class="col-2">
  Fecha Nacimiento:
  <c:out value="${param.fNacimiento}"></c:out>
  </div>

<div class="row">
<div class="col-4 mt-3">
Dirección:
<c:out value="${param.direccionn}"></c:out>  </div>
<div class="col-4 mt-3 mx-auto">
Población:
<c:out value="${param.poblacionn}"></c:out>  </div>
  <div class="col-4 mt-3 mx-auto">
  C.P:
<c:out value="${param.cp}"></c:out>  </div>
  </div>
  </div>
<h2 class="bg-success-subtle my-4 text-center">Datos Tutor</h2>
<div class="row">
<div class="col">
Nombre:
<c:out value="${param.nombre}"></c:out>  </div>
  <div class="col">
  Apellidos:
<c:out value="${param.apellidos}"></c:out>  </div>
  <div class="col">
Relación:
<c:out value="${param.relacion}"></c:out>   
  
</div>
  <div class="col-2">
  DNI:
<c:out value="${param.dni}"></c:out>  </div>
  <div class="col-2">
  Profesión:
<c:out value="${param.profesion}"></c:out>  </div>
  <div class="row ">
  <div class="col-3 mt-3 mx-auto">
  Teléfono:
<c:out value="${param.telefono}"></c:out>  </div>
  <div class="col-3 mt-3 mx-auto">
  E-mail:
<c:out value="${param.email}"></c:out>  </div>
 </div>
 </div>
 <hr class="mt-4 border border-black">
 <hr class="border border-black">
 
 <div class="row">
<div class="col">
Nombre:
<c:out value="${param.nombre2}"></c:out>  </div>
  <div class="col">
  Apellidos:
<c:out value="${param.apellidos2}"></c:out>  </div>
  <div class="col">
  Relación:
<c:out value="${param.relacion2}"></c:out> 
</div>
  <div class="col-2">
  DNI:
<c:out value="${param.dni2}"></c:out>  </div>
  <div class="col-2">
  Profesión:
<c:out value="${param.profesion2}"></c:out>  </div>
  <div class="row ">
  <div class="col-3 mt-3 mx-auto">
  Teléfono:
<c:out value="${param.telefono2}"></c:out>  </div>
  <div class="col-3 mt-3 mx-auto">
  E-mail:
<c:out value="${param.email}"></c:out>  </div>
 </div>
</div>

<div class="row">
<h2 class="bg-success-subtle my-4 text-center">Observaciones y otra informacion(alergias, medicación, etc...)</h2>

  <c:out value="${param.observacion}"></c:out>
</div>

<h2 class="bg-success-subtle my-4 text-center">Autorizados</h2>

<table class="table table-striped-columns border-black table-light">
  <thead>
    <tr>
      <th scope="col">Nombre y Apellidos</th>
      <th scope="col">Dni</th>
      <th scope="col">Telefono</th>
      <th scope="col">Relacion</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><c:out value="${param.nombret}"></c:out></td>
      <td><c:out value="${param.dnit}"></c:out></td>
      <td><c:out value="${param.telefonot}"></c:out></td>
      <td><c:out value="${param.relaciont}"></c:out></td>
    </tr>
    <tr>
      <td><c:out value="${param.nombret2}"></c:out></td>
      <td><c:out value="${param.dnit2}"></c:out></td>
      <td><c:out value="${param.telefonot2}"></c:out></td>
      <td><c:out value="${param.relaciont2}"></c:out></td>
    </tr>
    <tr>
      <td><c:out value="${param.nombret3}"></c:out></td>
      <td><c:out value="${param.dnit3}"></c:out></td>
      <td><c:out value="${param.telefonot3}"></c:out></td>
      <td><c:out value="${param.relaciont3}"></c:out></td>
    </tr>
  </tbody>
</table>
</div>
<!-- Esta seccion arreglar para el tema de las sesiones -->

<div class="col">
<a class="btn btn-outline-danger" href="javascript: history.go(-1)" role="button" >Volver al formulario</a>
<a class="btn btn-outline-success" href="completado.jsp" role="button"  >Enviar Formulario</a>
<a href="javascript: window.print()" class="btn btn-outline-success" role="button">&#128424;</a>

</div>


</body>
</html>