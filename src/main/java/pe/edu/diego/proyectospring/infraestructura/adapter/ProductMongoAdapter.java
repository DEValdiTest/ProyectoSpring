package pe.edu.diego.proyectospring.infraestructura.adapter;

import org.springframework.stereotype.Component;
import pe.edu.diego.proyectospring.domain.model.Product;
import pe.edu.diego.proyectospring.domain.port.ProductRepositoryPort;
import pe.edu.diego.proyectospring.infraestructura.repository.ProductRepository;
import reactor.core.publisher.Mono;

@Component
public class ProductMongoAdapter implements ProductRepositoryPort {

    private final ProductRepository productRepository;

    public ProductMongoAdapter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Mono<Product> findBySkuInkafarma(String skuInkafarma){
        System.out.println("goku 2 : " + skuInkafarma);
        return productRepository.findBySkuInkafarma(skuInkafarma).flatMap(x->{
            System.out.println("goku 3 : " + x);
            Product product = new Product();
            product.setSkuInkafarma(x.getSkuInkafarma());
            product.setSlug(x.getSlug());
            return Mono.just(product);
        });
    }

}
