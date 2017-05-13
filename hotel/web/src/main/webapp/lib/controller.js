angular.module('demo', [])
.controller('Hello', function($scope, $http) {
    $http.get('http://localhost:8080/hotel-web/rest/cliente/all').
        then(function(response) {
            $scope.greeting = response.data;
        });
});
angular.module('pesquisa', [])
.controller('listaClientes', function($scope, $http, $location) {
	 $scope.myUrl = window.location.protocol +'//' + window.location.host;
	 $chamada = $scope.myUrl+'/hotel-web/rest/cliente/all';
	 $http({
         type: 'GET',
         url: '/hotel-web/rest/cliente/all' ,
         contentType: 'application/json',
         dataType: 'json',
        
     }).then(function(response) {
        	
            $scope.greeting = response.data;

        });
});
