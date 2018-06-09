var app = angular.module('app', []);
app.controller('AddFirmController', function ($scope, $http, $location, $window) {

    $scope.addFirm = function () {
        var url = "http://localhost:8080/addfirm";
        var data = {
            "name": $scope.name,
            "nip": $scope.nip,
            "regon": $scope.regon
        };
        $http.post(url, data).then(function () {
            $window.location.href = "/firms";
        })
            .catch(function () {
                alert("error adding new firm");
            });
    };

});