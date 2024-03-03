package org.dnyanyog.service;

import java.util.Optional;

import org.dnyanyog.dto.DiscountRequest;
import org.dnyanyog.dto.DiscountResponse;

public interface DiscountService {

	public Optional<DiscountResponse> addDiscount(DiscountRequest request);
}