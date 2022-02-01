package com.example.mainmentbot.token;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

	@Autowired
	private ConfirmationTokenRepo confirmationtokenrepo;

	public void saveConfirmationToken(ConfirmationToken token) {

		confirmationtokenrepo.save(token);

	}

	public Optional<ConfirmationToken> getToken(String token) {
		ConfirmationToken confirmationToken = new ConfirmationToken(token, null, null, null);
		return Optional.of(confirmationToken);
	}

	public void setConfirmedAt(String token) {
		// TODO Auto-generated method stub

	}
}
