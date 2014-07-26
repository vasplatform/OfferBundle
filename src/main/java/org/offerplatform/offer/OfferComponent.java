package org.offerplatform.offer;

import org.offerplatform.offer.product.Product;

import java.util.List;

public class OfferComponent {

    /* products of the component */
    private List<Product> componentProducts;

    /* mandatory or not */
    private OfferComponentType componentType;

    /* this price is used to charge */
    private double componentPrice;

}
