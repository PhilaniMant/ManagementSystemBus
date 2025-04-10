import React from "react";
import { Link } from "react-router-dom";

function LandingPage() {
  return (
    <div className="container mt-5">
      <h1>Welcome to the Bus Management System</h1>
      <p>Please log in or register to access the system.</p>
      <Link to="/login" className="btn btn-primary me-2">Login</Link>
      <Link to="/register" className="btn btn-secondary">Register</Link>
    </div>
  );
}

export default LandingPage;