import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
        appBar: AppBar(
          leading: const Icon(
            Icons.menu,
          ),
          title: const Text("Assignment 1"),
          actions: [
            IconButton(
              onPressed: () {},
              icon: const Icon(
                Icons.search_rounded,
              ),
            ),
          ],
        ),
        body: MyList(),
      ),
    );
  }
}

class MyList extends StatelessWidget {
  const MyList({super.key});

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(15.0),
      child: ListView.separated(
        scrollDirection: Axis.vertical,
        separatorBuilder: (context, index) => const SizedBox(
          height: 20,
        ),
        itemCount: 10,
        itemBuilder: (context, index) {
          final colors = [
            Colors.blue[300],
            Colors.green[300],
            Colors.red[300],
            Colors.pink[300],
            Colors.orange[300],
            Colors.purple[300],
            Colors.brown[300],
            Colors.blueGrey[300],
            Colors.blue[500],
            Colors.brown[500],
          ];
          return Container(
            height: 220,
            width: 300,
            decoration: BoxDecoration(
              borderRadius: BorderRadius.circular(15),
              color: colors[index],
            ),
            child: const Stack(
              children: [
                Padding(
                  padding: EdgeInsets.all(10.0),
                  child: Align(
                    alignment: Alignment.topLeft,
                    child: Text(
                      "Top Left",
                      style: TextStyle(
                        color: Colors.white,
                        fontSize: 25,
                      ),
                    ),
                  ),
                ),
                Padding(
                  padding: EdgeInsets.all(10.0),
                  child: Align(
                    alignment: Alignment.center,
                    child: Text(
                      "Center",
                      style: TextStyle(
                        color: Colors.white,
                        fontSize: 25,
                      ),
                    ),
                  ),
                ),
                Padding(
                  padding: EdgeInsets.all(10.0),
                  child: Align(
                    alignment: Alignment.bottomRight,
                    child: Text(
                      "Bottom Right",
                      style: TextStyle(
                        color: Colors.white,
                        fontSize: 25,
                      ),
                    ),
                  ),
                ),
              ],
            ),
          );
        },
      ),
    );
  }
}
