package qr.reader.com;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.zxing.NotFoundException;

@RestController
public class QrCodeController {
	
	@Autowired
	private QrCodeController(QrCodeService qrCodeService) {
		
		this.qrCodeService = qrCodeService;
	}

	@Autowired
	private QrCodeService qrCodeService;
	
	@RequestMapping("/qrcode")
	public String readqrCode() throws FileNotFoundException, NotFoundException, IOException
	{
		 String filePath = "Qr.png";
		  String charset = "UTF-8"; // or "ISO-8859-1"
		  Map hintMap = new HashMap();
		 // hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		return qrCodeService.readQRCode(filePath, charset, hintMap);
		
	}
	
	

}
