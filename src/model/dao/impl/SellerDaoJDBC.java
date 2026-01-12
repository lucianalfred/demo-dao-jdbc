package model.dao.impl;

import java.util.List;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {
    
    // Constructor if needed
    public SellerDaoJDBC() {
        // Can initialize connection here if needed
    }
    
    @Override
    public void insert(Seller obj) {
        System.out.println("Inserting seller: " + obj.getName());
        // Actual JDBC implementation
    }
    
    @Override
    public void update(Seller obj) {
        // Implementation
    }
    
    @Override
    public void deleteById(Integer id) {
        // Implementation
    }
    
    @Override
    public Seller findById(Integer id) {
        // Implementation
        return null;
    }
    
    @Override
    public List<Seller> findAll() {
        // Implementation
        return null;
    }
}