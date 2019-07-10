package seleniumassignment.automation.pom.uielements;

public interface ProductDetailPageElements {

    String ADD_TO_WISH_LIST_XPATH = "//button[@class='btn-add-wishlist inactive']//span[contains(text(), 'Add to Wish List')]";
    String WISH_LIST_LINK_XPATH = "//span[@class='header_navbar-link-copy' and @data-copy= 'Wish List']";
    String PRODUCT_NAME_XPATH = "//div[@class='page-title']/h1[contains(text(), 'Paint')]";
}
