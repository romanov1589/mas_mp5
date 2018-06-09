var app = angular.module('app', []);

app.controller('HotelsController', function ($scope, $http, $location, $window) {

    $scope.hotels = [];
    $http.get('http://localhost:8080/allhotels')
        .then(function (response) {
            $scope.hotels = response.data;
            console.log("status:" + response.status);
        }).catch(function (response) {
        console.error('Error occurred:', response.status, response.data);
    }).finally(function () {
        console.log("Task Finished.");
    });

    $scope.deleteHotel = function (hotel) {
        var confirmDeleting = $window.confirm('Are you sure you want to delete this firm?');
        if (confirmDeleting) {
            $http.delete('http://localhost:8080/allhotels/' + hotel.hotelId).then(function () {
                $window.location.href = "/hotels";
            }).catch(function () {
                alert("error deleting firm");
            })
        }
    };

});
