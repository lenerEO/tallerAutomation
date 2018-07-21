Feature: Funcionalidad de búsqueda de productos
  Scenario: Búsqueda sin resultados
    Given Se carga la página de búsqueda
    When Buscamos el término "microsoft"
    Then Se muestra el mesaje "No results were found for your search"