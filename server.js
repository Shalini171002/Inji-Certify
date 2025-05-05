const express = require("express");
const app = express();
const PORT = process.env.PORT || 3001;

app.get("/api/features", (req, res) => {
  res.json([
    { title: "Electronic Health Records", description: "Secure storage." },
    { title: "Telehealth", description: "Remote consultations." },
  ]);
});

app.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});
