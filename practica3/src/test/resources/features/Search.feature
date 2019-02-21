Feature: Busqueda de Productos

  Scenario Outline: Busqueda exitosa
    Given User is in homepage
    When User performs a search with the term "<term>"
    Then Product is shown with price "<price>"
    Examples: lista de datos
    | term   | price  |
    | blouse | $27.00 |
    | skirt  | $26.00 |

  Scenario: Búsqueda sin resultados
    Given User is in homepage
    When User performs a search with the term "microsoft"
    Then System shows the message: "No results were found for your search"