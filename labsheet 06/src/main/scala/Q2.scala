object Q2 {

  def caesarEncrypt(text: String, shift: Int): String = {

    val encryptedChars = text.map { char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val encryptedChar = ((char - base + shift) % 26 + base).toChar
        encryptedChar

      } else {
        char
      }
    }
    encryptedChars.mkString
  }

  def caesarDecrypt(ciphertext: String, shift: Int): String = {

    caesarEncrypt(ciphertext, -shift)
  }

  def cipher(text: String, shift: Int, operation: String): String = {
    operation match {
      case "encrypt" => caesarEncrypt(text, shift)
      case "decrypt" => caesarDecrypt(text, shift)
      case _ => throw new IllegalArgumentException("Invalid operation. Use 'encrypt' or 'decrypt'.")
    }
  }

  def main(args: Array[String]): Unit = {
    val text = "SANDARU sandaru SaNdArU"
    val shift_count = 2

    // Encrypt the plaintext
    val encryptedText = cipher(text, shift_count, "encrypt")
    println("Encrypted:" + encryptedText)

    // Decrypt the ciphertext
    val decryptedText = cipher(encryptedText, shift_count, "decrypt")
    println("Decrypted:" + decryptedText)
  }
}
