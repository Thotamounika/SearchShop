$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8081/shop/staticpoint"
    }).then(function(data, status, jqxhr) {
       $('.greeting-id').append(data.shopName);
       $('.greeting-content').append(data.category);
       console.log(data);
       console.log(jqxhr);
    });
});