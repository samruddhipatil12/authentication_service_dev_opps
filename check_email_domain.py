#!/usr/bin/env python3
import subprocess

expectedEmail = "spati9451@dnyanyog.org"

email = subprocess.run(["git", "config", "user.email"], capture_output=True, text=True).stdout.strip()

if email == expectedEmail:
         print("You are using email as per configuration, proceeding to commit")
         exit(0)
else:
         print(f"Configured email is not as per config. It should be {expectedEmail}")
         exit(1)