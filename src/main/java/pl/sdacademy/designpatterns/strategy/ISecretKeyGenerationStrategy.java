package pl.sdacademy.designpatterns.strategy;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public interface ISecretKeyGenerationStrategy {
    SecretKey generate() throws NoSuchAlgorithmException;
}
