import 'package:flutter/material.dart';

class ProfilePage extends StatelessWidget {
  const ProfilePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            const Icon(
              Icons.person_outline,
              size: 120,
              color: Color.fromARGB(255, 224, 93, 247),
            ),
            const SizedBox(height: 24),
            const Text(
              'Your Profile',
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
              label: const Text('Edit Profile'),
              icon: const Icon(Icons.edit),
              onPressed: () {},
            ),
          ],
        ),
      ),
    );
  }
}
