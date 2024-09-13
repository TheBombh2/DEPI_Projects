import 'package:flutter/material.dart';
import 'package:flutter_login_screen/pages/welcome_page.dart';
import 'package:smooth_page_indicator/smooth_page_indicator.dart';

class OnboardingPage extends StatefulWidget {
  const OnboardingPage({super.key});

  @override
  _OnboardingPageState createState() => _OnboardingPageState();
}

class _OnboardingPageState extends State<OnboardingPage> {
  final _controller = PageController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color(0xFFEEECEC),
      body: SafeArea(
        child: Padding(
          padding: const EdgeInsets.all(10),
          child: Column(
            children: [
              SizedBox(
                height: MediaQuery.of(context).size.height * 0.7,
                child: PageView(
                  controller: _controller,
                  children: const [
                    WelcomePage(),
                    Placeholder(),
                    Placeholder(),
                  ],
                ),
              ),
              SmoothPageIndicator(
                controller: _controller,
                count: 3,
                effect: const JumpingDotEffect(
                    dotHeight: 10,
                    dotWidth: 10,
                    spacing: 16,
                    activeDotColor: Color(0xFF2f4eff)),
              ),
              const SizedBox(
                height: 15,
              ),
              SizedBox(
                width: double.infinity,
                height: 60,
                child: FilledButton(
                  onPressed: () {},
                  style: FilledButton.styleFrom(
                    shape: RoundedRectangleBorder(
                        borderRadius: BorderRadius.circular(30)),
                    backgroundColor: const Color(0xFF2f4eff),
                  ),
                  child: const Text(
                    "Login",
                    style: TextStyle(fontSize: 20),
                  ),
                ),
              ),
              const SizedBox(
                height: 30,
              ),
              SizedBox(
                width: double.infinity,
                child: TextButton(
                  onPressed: () {},
                  child: const Text(
                    'Create an account',
                    style: TextStyle(fontSize: 20,color: Color(0xFF2f4eff)),
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
