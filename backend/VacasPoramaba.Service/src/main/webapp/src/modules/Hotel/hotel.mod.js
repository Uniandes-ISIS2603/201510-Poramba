(function (angular) {
    var hotelModule = angular.module('hotelModule', ['CrudModule','MockModule']);
    hotelModule.constant('hotel.context', 'hotels');
    hotelModule.constant('hotel.skipMock', false);
    hotelModule.config(['hotel.context', 'MockModule.urlsProvider','hotel.skipMock', function (context, urlsProvider,skipMock) {
            urlsProvider.registerUrl(context,skipMock);
        }]);
})(window.angular);
