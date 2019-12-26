package com.search.SearchShop.controller;


import com.search.SearchShop.model.Shop;
import com.search.SearchShop.repo.ShopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/shop")
public class ShopController {

    @Autowired
    private ShopRepo shopRepo;
    @CrossOrigin(origins = "http://localhost:9000")
@GetMapping
    public List<Shop> findAll(){
        return shopRepo.findAll();
    }
    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping(value="/getShop/{shopName}")
    public Shop getShopRepo(@PathVariable String shopName) {
        return shopRepo.findDistinctShopByShopName(shopName);
    }

@PostMapping
    public Shop save(@Valid @NotNull @RequestBody Shop shop){
    return shopRepo.save(shop);

}
@PutMapping
public Shop update(@Valid @NotNull @RequestBody Shop shop){
    return shopRepo.save(shop);

}

@DeleteMapping(value="/{id}")
public void delete(@PathVariable long id){
    shopRepo.deleteById(id);
}




}
