angular.module('cliente', []).controller('listar', function($rootScope, $scope, $http, $location) {
	
		 $http({
         type: 'GET',
         url: '/hotel-web/rest/cliente/all' ,
         contentType: 'application/json',
         dataType: 'json',
        
     }).then(function(response) {
        	
            $scope.greeting = response.data;

        });
	 
});

angular.module('cliente', ['ngMask']).controller('incluiCliente', function($rootScope, $scope, $http, $location) {
	
	console.log("tudo certo!");

	 $scope.novoCliente = $scope.cliente;
	
	 $http({
         type: 'GET',
         url: '/hotel-web/rest/cliente/all' ,
         contentType: 'application/json',
         dataType: 'json',
        
     }).then(function(response) {
        	
            $scope.greeting = response.data;

        });
	
	 $scope.vainessa = function (){
		 
		 $scope.novoCliente = $scope.cliente;
	 };
	 
});
