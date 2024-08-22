package com.example.booksreviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BooksListAdapter(val books:List<Book>) : RecyclerView.Adapter<BooksListAdapter.BookViewHolder>() {
    class BookViewHolder(row : View) : RecyclerView.ViewHolder(row) {
        val tvTitle: TextView = row.findViewById(R.id.tv_book_title)
        val tvAuthor: TextView = row.findViewById(R.id.tv_book_author)
        val ivBookCover: ImageView = row.findViewById(R.id.iv_book_cover)
        val rb: RatingBar = row.findViewById(R.id.rating_bar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_book,parent,false))
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.tvTitle.text = books[position].title
        holder.tvAuthor.text = books[position].author
        holder.rb.rating = books[position].rate
        holder.ivBookCover.setImageResource(books[position].imageSrc)
    }
}