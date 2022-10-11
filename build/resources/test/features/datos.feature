Feature:  Como usuario , registrame en la pagina

  @prueba
  Scenario Outline:registar datos en la pagina todotest
    Given Dirigirse a la URL
    When el usuario da click en el boton registarse
    Then Usuario llena los datos del formulario con <email> tambien <codigopostal> tambien <telefono> y <contrasena>
    And usuario da click en boton confirmar registro

    Examples:
      |email|codigopostal|telefono|contrasena|
      |hola@pruebaprueba.com|110011|314456789|Holitas12|