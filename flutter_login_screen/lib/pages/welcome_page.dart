import 'package:flutter/material.dart';

class WelcomePage extends StatelessWidget {
  const WelcomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Image.asset('assets/images/image.png'),
        const SizedBox(
          height: 10,
        ),
        const Text(
          "Welcome to the app",
          style: TextStyle(fontSize: 30, fontWeight: FontWeight.bold),
        ),
        const SizedBox(
          height: 10,
        ),
        const Text(
          'We\'re excited to help you book and manage your service appointments with ease.',
          style: TextStyle(color: Colors.grey, fontSize: 18),
          textAlign: TextAlign.center,
        ),
      ],
    );
  }
}
