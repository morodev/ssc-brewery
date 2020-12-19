package guru.sfg.brewery.security.perms;

import org.springframework.security.access.prepost.PreAuthorize;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created By Luca Moro on 19/12/2020  14:54
 */
@Retention(RetentionPolicy.RUNTIME)
@PreAuthorize("hasAuthority('order.create') OR " +
        "hasAuthority('customer.order.create') " +
        "AND @beerOrderAuthenticationManager.customerIdMatches(authentication, #customerId)")
public @interface BeerOrderCreatePermission {
}
