package com.example.springbackend;

import com.example.springbackend.dao.CategoryRepository;
import com.example.springbackend.dao.ProductRepository;
import com.example.springbackend.model.Category;
import com.example.springbackend.model.Product;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.util.pattern.PathPatternRouteMatcher;

import java.util.Random;


@SpringBootApplication
public class SpringbackendApplication implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;


    public static void main(String[] args) {
        SpringApplication.run(SpringbackendApplication.class, args);
    }


    @Override
    public void run(String... args) {
//        categoryRepository.save(new Category(null,"Computers",null,null));
//        categoryRepository.save(new Category(null,"Printers",null,null));
//        categoryRepository.save(new Category(null,"Smartphones",null,null));
//
//        Random rnd=new Random();
//
//        categoryRepository.findAll().forEach(category -> {
//            for (int i=0; i <10; i++){
//                Product product=new Product();
//                product.setPhotoName("lol.png");
//                product.setAvailable(rnd.nextBoolean());
//                product.setCategory(category);
//                product.setName(RandomString.make(10));
//                product.setCurrentPrice(rnd.nextDouble());
//                product.setPromotion(rnd.nextBoolean());
//                productRepository.save(product);
//            }
//        });
    }
}