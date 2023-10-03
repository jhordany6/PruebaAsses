Feature: el usuario valida su usuario

  Scenario: Registro del usuario
    Given el "Certificador" esta en la pagina de yourStore
    When el usuario visualiza el header y sus componentes
    And el usuario procede a llenar los campos respectivos
    Then el usuario procede a visualizar dos mensajes de error

