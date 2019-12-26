package com.search.SearchShop.repo;

import com.search.SearchShop.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRepo extends JpaRepository<Shop, Long> {

    Shop findDistinctShopByShopName(String shopName);
}
