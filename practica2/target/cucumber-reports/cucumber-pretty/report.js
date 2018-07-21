$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Funcionalidad de búsqueda de productos",
  "description": "",
  "id": "funcionalidad-de-búsqueda-de-productos",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2585463426,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Búsqueda sin resultados",
  "description": "",
  "id": "funcionalidad-de-búsqueda-de-productos;búsqueda-sin-resultados",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Se carga la página de búsqueda",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Buscamos el término \"microsoft\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Se muestra el mesaje \"No results were found for your search\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.seCargaLaPáginaDeBúsqueda()"
});
formatter.result({
  "duration": 20624322950,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "microsoft",
      "offset": 21
    }
  ],
  "location": "Search.buscamosElTérmino(String)"
});
formatter.result({
  "duration": 1412734001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No results were found for your search",
      "offset": 22
    }
  ],
  "location": "Search.seMuestraElMesaje(String)"
});
formatter.result({
  "duration": 68382975,
  "status": "passed"
});
formatter.after({
  "duration": 1064512767,
  "status": "passed"
});
});