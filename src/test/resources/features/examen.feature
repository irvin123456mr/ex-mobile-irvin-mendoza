Feature: Registro de usuario en SwagLabs

  @test
  Scenario: Usuario se registra exitosamente

    Given que no existe usuario "Persona 1"
    When cuando me registro con el usuario "Persona 1"
    And contraseña "2022"
    And hago clic en el botón login
    Then muestra el mensaje "Se registro exitosamente"

  @test
  Scenario: Usuario se encuentra bloqueado

    Given que existe usuario "Persona 2"
    When cuando me registro con el usuario "Persona 2"
    And contraseña "2023"
    And hago clic en el botón login
    Then muestra el mensaje "error el usuario se encuentra bloqueado"
