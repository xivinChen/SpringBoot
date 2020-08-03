package xyz.java1024.springboothello.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

/**
 * @author ：chenxingwen
 * @version : 1.0
 * @date ：Created in 2020/8/3 17:21
 * @description：
 * @email : 1250402127@qq.com
 */
@RestController
@RequestMapping("/qr_code")
public class QRCode {

    @GetMapping("/")
    public String getCode(HttpServletRequest request) {

        HashMap<EncodeHintType, Object> hashMap = new HashMap<>();
        hashMap.put(EncodeHintType.CHARACTER_SET,"utf-8");
        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        hashMap.put(EncodeHintType.MARGIN,2);
        try {
            BitMatrix writer = new MultiFormatWriter().encode("this is content", BarcodeFormat.QR_CODE, 300, 300, hashMap);
            Path file = new File("d:\\img.png").toPath();
            MatrixToImageWriter.writeToPath(writer,"png",file);
        }catch (Exception e) {
            e.printStackTrace();
        }

        return "Success";

    }
}
