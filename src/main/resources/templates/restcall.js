$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8081/shop/getShop/Dmart"
    }).then(function(data) {
       $('.greeting-id').append(data.shopName);
       $('.greeting-content').append(data.category);
    });
});