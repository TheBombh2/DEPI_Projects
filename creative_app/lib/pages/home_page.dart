import 'package:flutter/material.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            const Icon(
              Icons.home_outlined,
              size: 120,
              color: Color.fromARGB(255, 224, 93, 247),
            ),
            const SizedBox(height: 24),
            const Text(
              'Welcome Home!',
              style: TextStyle(
                fontWeight: FontWeight.bold,
                color: Color.fromARGB(255, 224, 93, 247),
                fontSize: 30,
              ),
            ),
            const SizedBox(height: 24),
            FilledButton.icon(
              style: FilledButton.styleFrom(
                  iconColor: Colors.white,
                  backgroundColor: Color.fromARGB(255, 224, 93, 247)),
              label: const Text('Explore'),
              icon: const Icon(Icons.explore),
              onPressed: () {},
            ),
          ],
        ),
      ),
    );
  }
}
