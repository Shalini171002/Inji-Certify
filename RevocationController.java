package com.Controller;

import java.sql.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RevocationController {

    @PostMapping("/revoke-credential")
    public ResponseEntity<String> revokeCredential(@RequestBody RevocationRequest request) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/credential_issuance","root","root")) {
            String sql = "UPDATE credential_issuance SET credential_status = ?, revocation_timestamp = ?, revocation_reason = ? WHERE credential_id = ?";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, "revoked");
                stmt.setTimestamp(2, Timestamp.valueOf(request.getRevocationTimestamp()));
                stmt.setString(3, request.getRevocationReason());
                stmt.setString(4, request.getCredentialId());
                
                int rowsAffected = stmt.executeUpdate();
                if (rowsAffected > 0) {
                    // Here we would generate the cryptographic proof (e.g., hash or signature)
                    // Update status in the BitStringStatusListEntry
                    return ResponseEntity.ok("Credential revoked successfully");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error revoking credential");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error revoking credential");
    }
}


