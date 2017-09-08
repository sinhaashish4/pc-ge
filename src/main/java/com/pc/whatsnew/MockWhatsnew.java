package com.pc.whatsnew;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MockWhatsnew {

	public List<Whatsnew> getList() {
		return Arrays.asList(
				new Whatsnew("Samsung Galaxy Note 8", "Get a free Dex Station (RRP 139) when you pre-order",
						"www.google.com"),
				new Whatsnew("5 Things you can ONLY do with Note 8",
						"from the artistic to the downright handly, here re the amazing things you can only do with Note8",
						"www.google.com"),
				new Whatsnew("EU Roaming - Another great Extra from EE",
						"Use your minutes, texts and data across the EU at no extra cost.", "www.google.com"),
				new Whatsnew("Unlimited EE Home Braodbankd from just £21 per month",
						"Swith to EE Broadband and you'll also get an extra 5GB of dta added to your mobile plan every month",
						"www.google.com"),
				new Whatsnew("Beats X wireless earphones",
						"Fit for your life, Beats X are the perfect wireless comapnion with 8 hours battery life and fast-fuel charging.",
						"www.google.com"));
	}
}
