#!/bin/bash

# Define the expected domain
domain="spati9451@dnyanyog.com"

# Get the configured email from Git
email="$(git config user.email)"

# Check if the configured email matches the expected domain
if [ "$email" == "$domain" ]; then
    echo "You are using email as per configuration, proceeding to commit"
    exit 0
else
    echo "Configured email is not as per config. it should be $domain"
    exit 1
fi
