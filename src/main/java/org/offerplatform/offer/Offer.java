package org.offerplatform.offer;

import org.offerplatform.offer.applicability.OfferApplicabilityCriteria;
import org.offerplatform.offer.eligibility.OfferEligibilityCriteria;
import org.offerplatform.offer.notification.OfferNotification;
import org.offerplatform.offer.pricing.OfferPricing;

import java.util.List;

public class Offer {

    /* All offer related internal processing is handle via internal id */
    private int offerInternalID;

    /* outside parties will identify offer from this id */
    private String offerExternalID;

    /* represents the name of the offer and used internally */
    private String offerName;

    /* this name displayed to external parties. mostly for store fronts */
    private String displayName;

    /* description for out side parties. mostly for store fronts */
    private String displayDescription;

    /* these components are the core of offer */
    List<OfferComponent> offerComponents;

    /* global notifications those apply in offer level */
    List<OfferNotification> notifications;

    /* represents who can purchase this offer */
    List<OfferEligibilityCriteria> offerEligibilityCriteria;

    /* discount applicability criteria */
    List<OfferApplicabilityCriteria> offerApplicabilityCriteria;

    /* defines offer level price */
    OfferPricing offerPricing;

}
