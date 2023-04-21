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
<link href="<c:url value='img/desarrollador-de-software.png'></c:url>" rel="icon" >
</head>
<body>
<!-- Incluir el encabezado en todas las páginas -->
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
<p class="text-danger">
<c:out value="${error}"></c:out>
</p>

<p>(*)Campos obligatorios</p>
<form action="Controller" method="get"  class="row g-3 needs-validation" novalidate>
<h2 class="bg-success-subtle text-center">Datos del niñ@</h2>
<div class="row">
  <div class="col">
    <input type="text" class="form-control text-capitalize" placeholder="Nombre*" aria-label="Nombre" name="nombren" value="${param.nombren}" required pattern="[a-zA-Z]+">
  </div>
  <div class="col">
    <input type="text" class="form-control text-capitalize" placeholder="Apellidos*" aria-label="Apellidos" name="apellidosn" value="${param.apellidosn}" required pattern="[a-zA-Z]+">
  </div>
  <div class="col-2 text-end pt-xl-2" >
  <label for="fNacimiento" >Fecha nacimiento*</label>
  </div>
  <div class="col-2">
  <input type="date" class="form-control" aria-label="Fecha Nacimiento" name="fNacimiento" value="${param.fNacimiento}" required> 
  </div>

<div class="row">
<div class="col-4 mt-3">
  <input type=text class="form-control text-capitalize" aria-label="Direccion" name="direccion" placeholder="Dirección*" value="${param.direccion}" required >
  </div>
<div class="col-4 mt-3 mx-auto">
  <input type=text class="form-control text-capitalize" aria-label="Poblacion" name="poblacion" placeholder="Población*" value="${param.poblacion}" required pattern="[a-zA-Z]+">
  </div>
  <div class="col-4 mt-3 mx-auto">
  <input type=text class="form-control" aria-label="CP" name="cp" placeholder="Codigo Postal*" value="${param.cp}" required pattern="[0-9]{5}">
  </div>
  </div>
  </div>
<h2 class="bg-success-subtle my-4 text-center">Datos Tutor</h2>
<div class="row">
<div class="col">
    <input type="text" class="form-control text-capitalize"  placeholder="Nombre*" aria-label="Nombre" name="nombre" value="${param.nombre}" required pattern="[a-zA-Z]+">
  </div>
  <div class="col">
    <input type="text" class="form-control text-capitalize" placeholder="Apellidos*" aria-label="Apellidos" name="apellidos" value="${param.apellidos}" required pattern="[a-zA-Z]+">
  </div>
  <div class="col">

  <select class="form-select form-select-sm" id="floatingSelect"  aria-label="Floating label select example" name="relacion" value="${param.relacion}" required>
    <option selected>Elige opcion*</option>
    <option value="padre">Padre</option>
    <option value="madre">Madre</option>
    <option value="tutor">Tutor</option>
  </select>  
</div>
  <div class="col-2">
    <input type="text" class="form-control text-Uppercase" placeholder="DNI*" aria-label="dni" name="dni" value="${param.dni}" required>
  </div>
  <div class="col-2">
    <input type="text" class="form-control text-capitalize" placeholder="Profesión" aria-label="profesion" name="profesion" pattern="[a-zA-Z]+">
  </div>
  </div>
  
  <div class="row ">
  <div class="col-3 mt-3 mx-auto">
    <input type="text" class="form-control" placeholder="Teléfono*" aria-label="telefono" name="telefono" value="${param.telefono}" required pattern="[6789]{1}[0-9]{9}">
  </div>
  <div class="col-3 mt-3 mx-auto">
    <input type="email" class="form-control" placeholder="e-mail" aria-label="email" name="email" value="${param.email}">
  </div>
 </div>
 <hr class="mt-4 border border-black">
 <hr class="border border-black">
 <div class="row">
<div class="col">
    <input type="text" class="form-control text-capitalize" placeholder="Nombre" aria-label="Nombre" name="nombre2" value="${param.nombre2}" pattern="[a-zA-Z]+">
  </div>
  <div class="col">
    <input type="text" class="form-control text-capitalize" placeholder="Apellidos" aria-label="Apellidos" name="apellidos2" value="${param.apellidos2}" pattern="[a-zA-Z]+">
  </div>
  <div class="col">

  <select class="form-select form-select-sm" id="floatingSelect" aria-label="Floating label select example" name="relacion2" value="${param.relacion2}" pattern="[a-zA-Z]+">
    <option selected></option>
    <option value="padre">Padre</option>
    <option value="madre">Madre</option>
    <option value="tutor">Tutor</option>
  </select>  
</div>
  <div class="col-2">
    <input type="text" class="form-control text-Uppercase" placeholder="DNI" aria-label="dni" name="dni2" value="${param.dni2}">
  </div>
  <div class="col-2">
    <input type="text" class="form-control text-capitalize" placeholder="Profesión" aria-label="profesion" name="profesion2" value="${param.profesion2}" pattern="[a-zA-Z]+">
  </div>
  <div class="row ">
  <div class="col-3 mt-3 mx-auto">
    <input type="text" class="form-control " placeholder="Teléfono" aria-label="telefono" name="telefono2" value="${param.telefono2}" pattern="[6789]{1}[0-9]{9}">
  </div>
  <div class="col-3 mt-3 mx-auto">
    <input type="email" class="form-control text-LowerCase" placeholder="e-mail" aria-label="email" name="email2" value="${param.email2}">
  </div>
 </div>
</div>

<div class="row">
<h2 class="bg-success-subtle my-4 text-center text-Uppercase">Observaciones y otra informacion(alergias, medicación, etc...)</h2>

  <textarea class="form-control bg-primary-subtle" placeholder="Observaciones"  name="observacion" id="Observaciones" rows="4"></textarea>
  <label for="floatingTextarea"></label>
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
      <td><input type="text" class="form-control" placeholder="Nombre y Apellidos*" aria-label="Nombre" name="nombret" value="${param.nombret}" required pattern="[a-zA-Z]+"></td>
      <td><input type="text" class="form-control" placeholder="DNI*" aria-label="dni" name="dnit" value="${param.dnit}" required></td>
      <td><input type="text" class="form-control" placeholder="Teléfono*" aria-label="telefono" name="telefonot" value="${param.telefonot}" required pattern="[6789]{1}[0-9]{9}"></td>
      <td><input type="text" class="form-control" placeholder="Relación familiar*" aria-label="Relacion" name="relaciont" value="${param.relaciont}" required></td>
    </tr>
    <tr>
      <td><input type="text" class="form-control" placeholder="Nombre y Apellidos" aria-label="Nombre" name="nombret2" pattern="[a-zA-Z]+"></td>
      <td><input type="text" class="form-control" placeholder="DNI" aria-label="dni" name="dnit2"></td>
      <td><input type="text" class="form-control" placeholder="Teléfono" aria-label="telefono" name="telefonot2" pattern="[789][0-9]{9}"></td>
      <td><input type="text" class="form-control" placeholder="Relación familiar" aria-label="Relacion" name="relaciont2"></td>
    </tr>
    <tr>
      <td><input type="text" class="form-control" placeholder="Nombre y Apellidos" aria-label="Nombre" name="nombret3" pattern="[a-zA-Z]+"></td>
      <td><input type="text" class="form-control" placeholder="DNI" aria-label="dni" name="dnit3"></td>
      <td><input type="text" class="form-control" placeholder="Teléfono" aria-label="telefono" name="telefonot3" pattern="[789][0-9]{9}"></td>
      <td><input type="text" class="form-control" placeholder="Relación familiar" aria-label="Relacion" name="relaciont3"></td>
    </tr>
  </tbody>
</table>



<div class="row mt-5">
  <div class="col text-center">
  <input type="submit" name="enviar" value="Enviar Datos" class="btn btn-outline-success" >
  <input type="reset" name="borrar" value="Borrar Datos" class="btn btn-outline-danger">
</div>
</div>

</form>
</div>
<script>
//Example starter JavaScript for disabling form submissions if there are invalid fields
(() => {
  'use strict'

  // Fetch all the forms we want to apply custom Bootstrap validation styles to
  const forms = document.querySelectorAll('.needs-validation')

  // Loop over them and prevent submission
  Array.from(forms).forEach(form => {
    form.addEventListener('submit', event => {
      if (!form.checkValidity()) {
        event.preventDefault()
        event.stopPropagation()
      }

      form.classList.add('was-validated')
    }, false)
  })
})()

</script>

</body>

<jsp:include page="footer.jsp"></jsp:include>
</html>