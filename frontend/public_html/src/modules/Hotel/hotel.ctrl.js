(function () {
	var app = angular.module('hotelModule');

	app.controller('hotelCtrl', ['$scope', 'CRUDUtils', 'hotel.context', '$location', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
                        
			this.fetchRecords();
                        
                        
                        this.ana = function()
                        {
                           // <---- $location.path('/event').replace();-->
                            alert ('anama');
                        };
                         this.inicializarNombre = function(){
                                $scope.currentRecord.name = 'Pestana casino park';
                            };
                               this.inicializarUbicacion = function(){
                                $scope.currentRecord.ubicacionHot = 'Isla de madeira';
                            };
                              this.inicializarDescripcion = function(){
                                $scope.currentRecord.descripcion = 'EL PESTANA CASINO PARK FORMA PARTE DEL COMPLEJO TURÍSTICO MÁS EMBLEMÁTICO DE LA ISLA DE MADEIRA.';
                            };
                              this.inicializarUrl = function(){
                                $scope.currentRecord.link = 'http://www.pestana.com/es/pestana-casino-park-hotel/pages/home.aspx';
                            };
		}]);           
            
            
            
            
})();
