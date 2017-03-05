package rwolhin.slowcat.tunnel.shadowsocks;

/**
 * Created by rwolhin on 10.02.17.
 */

import java.io.ByteArrayOutputStream;

/**
 * Interface of crypt
 */
public interface ICrypt {
    byte[] encrypt(byte[] data);

    byte[] decrypt(byte[] data);

    void encrypt(byte[] data, ByteArrayOutputStream stream);

    void encrypt(byte[] data, int length, ByteArrayOutputStream stream);

    void decrypt(byte[] data, ByteArrayOutputStream stream);

    void decrypt(byte[] data, int length, ByteArrayOutputStream stream);

    int getIVLength();

    int getKeyLength();
}
