<p align="center">
  <img src="http://manuelsr.com/images/unam.png" align="right" hspace="5">
  <img src="http://manuelsr.com/images/ciencias.png" align="right" hspace="5">
  <h1>Ingenieria de Software, 2018-2</h1>
</p>

Ejercicio 2 : Consultas en HQL
----------------------------------------------------

### 1. Realiza las siguientes consultas en HQL.

* Todos los profesionistas.
```shell
 from Profesionista
```
 * Todas las vacantes. 
```shell
 From Vacante
```
* Todos las empresas.
```shell
 From Empresa
```
* Todos los prfesionistas que tengan experiencia laboral en oracle.
```shell
 from Profesionista as pro where pro.empresaLaboral='oracle'
```
* Todos los profesionistas que estudiaron en la UNAM.
```shell
 from Profesionista as pro where pro.colegioFormacion='unam'
```
* Todos los profesionistas que se postularon para el puesto de web developer.
```shell
  from Postular as pos
    inner join pos.vacante as id_vacante where id_vacante.puesto='web developer'
```
* Todas las empresas que tengan vacantes para el puesto de Manager.
```shell
  from Tener as ten
    inner join ten.vacante as id_vacante where id_vacante.puesto='Manager'
```
* Todos los profesionistas que se postularon en la empresa Google.
```shell
  from Postular as pos, Tener as ten
 	inner join pos.vacante as id_vacante
 		inner join ten.empresa where id_empresa.nombre_Empresa='Google'
```
