String desiredPassword = ‘“Topsecret”

try {

PdfReader pdfReader = new PdfReader(request.getInputStream());

PdfStamper pdfStamper = new PdfStamper(pdfReader ,resp.getOutputStream());

pdfStamper.setEncryption(desiredPassword.getBytes(), desiredPassword.getBytes(),

PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_256 | PdfWriter.DO_NOT_ENCRYPT_METADATA);

if(pdfStamper != null) {

try {

pdfStamper.close();

} catch (DocumentException e) {

throw e

}

}

} catch (Exception e) {

e.printStackTrace();

throw e;

}
