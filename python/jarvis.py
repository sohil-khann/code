import tkinter as tk
from tkinter import messagebox

def on_button_click():
    messagebox.showinfo("Button clicked", "You clicked the button!")

root = tk.Tk()
root.title("Simple tkinter Program")

label = tk.Label(root, text="Hello, Jarvis!")
label.pack()

button = tk.Button(root, text="Click me", command=on_button_click)
button.pack()

root.mainloop()