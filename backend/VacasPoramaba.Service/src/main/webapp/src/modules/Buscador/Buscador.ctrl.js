(function (angular) {
    var app = angular.module('BuscadorModule',[]);
    app.controller('BuscadorCtrl', ['$scope', 'BuscadorService', function ($scope, Buscadorservice) {
            Buscadorservice.extendCtrl(this, $scope);
            this.fetchRecords();
            
            this.getResultado=function(palabraClave){
                //BuscadorService
                
                
            }
        }]);
})(window.angular);
