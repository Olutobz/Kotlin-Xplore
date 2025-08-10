package main.practice.assessments

/**
 * Created by Damola Olutoba Onikoyi
 * DATE: 09, August 2025
 * EMAIL: damexxey94@gmail.com
 */

/**
Implement a function to identify a user's location region based on their IP address.
Four octets represent IPv4 addresses in the format "a.b.c.d" (example: 127.10.20.30).

These IP addresses are classified into 5 different regions based on the first octet's value:
1. 0.0.0.0 - 127.255.255.255
2. 128.0.0.0 - 191.255.255.255
3. 192.0.0.0 - 223.255.255.255
4. 224.0.0.0 - 239.255.255.255
5. 240.0.0.0 - 255.255.255.255

Given a list of strings ip_addresses representing potential IPv4 addresses,
determine the validity of each address and classify it into one of the 5 regions.
Return an array of integers representing the region index for each corresponding IP address.
Invalid IP addresses should be represented as -1.

An IPv4 address is valid if:
• It contains exactly four octets separated by periods
• Each octet is an integer between 0 and 255, inclusive
• There are no leading zeros in any octet

Example:
Suppose ip_addresses = ["128.12.34.0", "31.258.90.1"]
IP -> Region ->Remarks
128.12.34.0 = 2
Belongs to (128.0.0.0, 191.255.255.255)

31.258.90.11 => -1
The second octet, 258 > 255, is invalid.
Hence, the answer is (2, -11).

Function Description
Complete the function getRegions in the editor with the following parameters: string ip_addresses in i:
the list of possible IPv4 addresses

Returns
int Ini: the regions of the IP addresses or -1 if the IP is invalid
 **/


fun getRegions(ipAddresses: List<String>): List<Int> {
    val result = mutableListOf<Int>()

    for (ip in ipAddresses) {
        if (!isValidIpv4(ip)) {
            result.add(-1)
            continue
        }

        val firstOctet = ip.split(".")[0].toInt()
        when (firstOctet) {
            in 0..127 -> result.add(1)
            in 128..191 -> result.add(2)
            in 192..223 -> result.add(3)
            in 224..239 -> result.add(4)
            in 240..255 -> result.add(5)
            else -> result.add(-1)
        }
    }

    return result
}

private fun isValidIpv4(ip: String): Boolean {
    val parts = ip.split(".")
    if (parts.size != 4) return false

    for (part in parts) {
        if (part.isEmpty() || !part.all(predicate = { it.isDigit() })) return false
        if (part.length > 1 && part.startsWith('0')) return false

        val number = part.toIntOrNull() ?: return false
        if (number !in 0..255) return false
    }

    return true
}
