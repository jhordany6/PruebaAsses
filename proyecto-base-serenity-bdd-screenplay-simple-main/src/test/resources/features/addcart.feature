Feature: agregar producto al carrito

  Scenario: Añadir producto al carrito
    Given el "Certificador" esta en la pagina de yourStore
    When el usuario visualiza el producto MacBook
    And interractua en la interna del producto
    Then el usuario valida el mensaje de success

