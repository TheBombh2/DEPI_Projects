import 'package:flutter/material.dart';

class SearchPage extends StatelessWidget {
  const SearchPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            const Icon(
              Icons.search,
              size: 120,
              color: Color.fromARGB(255, 224, 93, 247),
            ),
            const SizedBox(height: 24),
            const Text(
              'Find What You Need!',
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
              label: const Text('Start Searching'),
              icon: const Icon(Icons.search),
              onPressed: () {},
            ),
          ],
        ),
      ),
    );
  }
}